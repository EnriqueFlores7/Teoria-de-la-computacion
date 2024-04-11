Algoritmo ExprePipe
	Definir cadena Como Caracter
	Definir i Como Entero
	
	Escribir 'Ingrese una cadena'
	Leer cadena
	i<-1
	
	si Subcadena(cadena,i,i)='a'
		i<-i+1
		si Longitud(cadena)=i-1
			Escribir 'Cadena valida'
		SiNo
			Escribir 'Cadena valida para la expresion'
		FinSi
		
	Sino
			
FinAlgoritmo
