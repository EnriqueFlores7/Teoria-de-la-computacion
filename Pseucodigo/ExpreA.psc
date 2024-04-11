Algoritmo ExpreA
	Definir cadena Como Caracter
	Definir  i Como Entero
	
	Escribir 'Ingresar una cadena'
	Leer cadena
	i<-1
	si Subcadena(cadena,i,i)='a'
		i<-i+1
		si Longitud(cadena)=i-1
			Escribir 'Tu cadena es valida para la expresion'
		SiNo
			Escribir 'Tu cades no es valida para la expresion'
		FinSi
	SiNo
		Escribir 'Tuc cadena no es valida para la exprexion'
	FinSi
	
FinAlgoritmo
