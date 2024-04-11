Algoritmo ExpreConc
	Definir cadena Como Caracter
	Definir i Como Entero
	
	Escribir 'Ingresa una cadena'
	Leer cadena
	i<-1
	si Subcadena(cadena,i,i)='a'
		i<-i+1
		si Subcadena(cadena,i,i)='b'
			i<-i+1
			si Longitud(cadena)=i-1
				Escribir 'Es una cadena valida'
			SiNo
				Escribir 'No es una caden valida para la expresion'
			FinSi
	Fin si
	SiNo
		Escribir 'No es una cadena valida para la expresion'
	FinSi
	
	
FinAlgoritmo