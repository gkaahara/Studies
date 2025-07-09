# flight-delay-prediction-databricks/README.md

# 🚀 Previsão de Atrasos em Voos com Databricks

Este projeto demonstra um pipeline completo de Machine Learning utilizando a plataforma **Databricks**.
Aqui você encontrará etapas que abrangem desde a ingestão de dados com **PySpark**, tratamento com **Delta Lake**, modelagem com **MLflow** e deploy do modelo.

## 📊 Problema
Prever se um voo sofrerá atraso com base em dados históricos, como companhia aérea, horário, origem, destino, etc.

## 🛠️ Stack Utilizada
- **Databricks Notebooks**
- **PySpark / Delta Lake**
- **MLflow**
- **scikit-learn**
- **Python 3.9+**

## 📁 Estrutura do Projeto
```
flight-delay-prediction-databricks/
├── notebooks/
│   ├── 01_data_ingestion.py              # Ingestão de dados com PySpark
│   ├── 02_data_cleaning_and_eda.py      # Limpeza, análise exploratória
│   ├── 03_feature_engineering.py        # Criação e seleção de features
│   ├── 04_model_training_mlflow.py      # Treinamento e tracking de modelos com MLflow
│   └── 05_model_evaluation_and_serving.py # Avaliação e exportação para produção
│
├── data/                                # Instruções ou scripts para ingestão de dados
│   └── README_data.md
│
├── requirements.txt                     # Dependências (caso queira testar localmente)
├── LICENSE
└── README.md                            # Este arquivo
```

## 🔍 Prévia do Fluxo
1. Leitura de dados CSV reais (ex: [US DOT On-Time](https://www.transtats.bts.gov/OT_Delay/OT_DelayCause1.asp))
2. Conversão para Delta Lake com versionamento
3. Engenharia de features com PySpark
4. Modelos: Random Forest, Gradient Boosting (usando scikit-learn)
5. Rastreio de experimentos com MLflow
6. Avaliação com métricas padrão
7. (Opcional) Deploy com MLflow Model Registry ou Serving

## 📸 Screenshots (coloque imagens do seu ambiente Databricks aqui)
- Notebooks
- MLflow Runs
- Visualizações EDA

## 📌 Como Executar
1. Importe o projeto como **repo Git** no seu workspace Databricks
2. Siga os notebooks na ordem sequencial
3. Customize seu pipeline conforme desejado

## ✍️ Autor
Gabriel Kaahara – [github.com/gabrielkaahara](https://github.com/gabrielkaahara)

---

# notebooks/01_data_ingestion.py

# Databricks notebook source
# MAGIC %md
# MAGIC ## Ingestão de Dados: Atrasos em Voos
# MAGIC Utilizando PySpark + Delta Lake

# COMMAND ----------
from pyspark.sql.functions import *
from pyspark.sql.types import *

# Substitua este caminho pelo caminho do seu dataset (ou use Autoloader se estiver na cloud)
df = spark.read.option("header", True).csv("/dbfs/FileStore/data/voos.csv")
df.printSchema()
df.display()

# COMMAND ----------
# Salvar em Delta Lake
(df.write
 .format("delta")
 .mode("overwrite")
 .save("/delta/voos"))

# Criação da tabela Delta (opcional)
spark.sql("CREATE TABLE IF NOT EXISTS voos_delta USING DELTA LOCATION '/delta/voos'")

# COMMAND ----------
# Visualização básica
df.groupBy("CARRIER").count().orderBy("count", ascending=False).show()

# COMMAND ----------
# Continue com limpeza e EDA no próximo notebook...
