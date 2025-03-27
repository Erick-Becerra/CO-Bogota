import random

def generar_datos(ruta_archivo, total_numeros):
    numeros_por_iteracion = 10_000_000 
    iteraciones = total_numeros // numeros_por_iteracion

    with open(ruta_archivo, "w") as f:
        for i in range(iteraciones):
            datos = [str(random.randint(0, 9)) for _ in range(numeros_por_iteracion)]
            f.write(",".join(datos) + ",")
            print(f"Bloque {i + 1} de {iteraciones} generado.")

        numeros_restantes = total_numeros % numeros_por_iteracion
        if numeros_restantes > 0:
            datos = [str(random.randint(0, 9)) for _ in range(numeros_restantes)]
            f.write(",".join(datos))
            print("Números restantes generados.")

    print(f"Archivo generado exitosamente: {ruta_archivo}")

generar_datos("datos_de_prueba_1M.csv", 10_000_000)