num = int(input("Insira um número INTEIRO POSITIVO: "))
print("\n".join([f"{num} x {i+1} = {num*(i+1)}" for i in range(10)]))