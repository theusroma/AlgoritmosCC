import pickle
import numpy as np


novo_dado = [[2200]]

scaler_model = pickle.load(open('scaler_model.pkl', 'rb'))

novo_dado_norm = scaler_model.transform(novo_dado)

print(novo_dado_norm)

# 1. Digite o valor normalizado que você quer reverter (sempre dentro de [[ ]])
meu_valor_normalizado = [[1]]

# 2. Use o inverse_transform no seu scaler já treinado
valor_natural = scaler_model.inverse_transform(meu_valor_normalizado)

print("\n--- Resultado da Reversão ---")
print(f"Valor Normalizado de entrada: {meu_valor_normalizado[0][0]}")
print(f"Valor Natural de saída: {valor_natural[0][0]:.2f}") 
# O resultado será aproximadamente 3000.00
