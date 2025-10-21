from sortSeleccion import SortSeleccion
def main():
    numeros = [5,2,9,1,5,6]
    print("Estudiante : Xavier Fajardo")
    print("Original:" , numeros)

    
    ## instanciar
    selection = SortSeleccion()
    selection.sort_ascendente(numeros)
    print("Ordenado ascendente:" , numeros)
    selection.sort_descendente(numeros)
    print("Ordenado descendente:" , numeros)


if __name__ == "__main__":
    main()