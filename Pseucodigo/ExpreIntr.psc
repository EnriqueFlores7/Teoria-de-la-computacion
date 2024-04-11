Algoritmo ExpreIntr
	Definir cadena Como Caracter
	Definir i Como Entero
	
	Escribir 'Ingresa una cadena'
	leer cadena
	i<-1
	Si Subcadena(cadena,i,i)='a'
		i<-i+1
		si Longitud(cadena)=i-1
			Escribir 'Si es una cadena valida para la expresion'
		SiNo
			Escribir 'No es una cadena valida para la expresion'
		FinSi
	SiNo	
		si Longitud(cadena)=i-1
			Escribir 'Si es una cadena valida para la expresion'
		SiNo
			Escribir 'No es una cadena valida para la expresion'
		FinSi
	FinSi
FinAlgoritmo
