Algoritmo ExpreVacio
	Definir cadena Como Caracter
	Definir i Como Entero
	
	Escribir  'Ingresa cadena'
	Leer cadena
	i<-1
	Mientras Subcadena(cadena,i,i)='a'
		i<-i+1
	FinMientras
	SI Longitud(cadena)=i-1
		Escribir 'Es una cadena valida para la expresion'
	SiNo
		Escribir 'No es una cadena valida para la expresion'
	FinSi
FinAlgoritmo