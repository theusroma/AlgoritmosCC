import numpy as np
from sklearn.preprocessing import MinMaxScaler
import pickle
dados = np.array([[1500], [3000], [5500], [10000]])

scaler = MinMaxScaler()


scaler_model = scaler.fit(dados)

pickle.dump(scaler_model, open('scaler_model.pkl', 'wb'))

dados_norm = scaler_model.fit_transform(dados)
print(dados_norm)
