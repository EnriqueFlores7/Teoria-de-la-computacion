Algoritmo ExpreMas
	Definir cadena Como Caracter
	Definir i Como Entero
	
	Escribir 'Ingrese un cadena'
	Leer cadena
	i<-i
	si Subcadena(cadena, i, i)='a'
		i<-i+1
		Mientras Subcadena(cadena,i,i)='a' hacer
			i<-i+1
		FinMientras
		Si Longitud(cadena)=i-1
			Escribir 'Si es una cadena valida'
		SiNo
			Escribir 'No es una cadena valida para la expresion'
		FinSi
	SiNo
		Escribir 'No es una cadena valida'
	FinSi
FinAlgoritmo
