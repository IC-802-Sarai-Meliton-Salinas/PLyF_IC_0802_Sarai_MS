clase  pública FP_Funcional_01 {
	public  static  void  main ( String [] args ){
	Lista < Entero > números = Lista . de ( 12 , 9 , 13 , 4 , 6 , 2 , 4 , 12 , 15 );

	sistema _ fuera _ println ( "Usando para --> [System.out::print] por defecto" );
	printAllNumbersInListFunctional_Two ( números );
	sistema _ fuera _ println ( "\nimprimirTodosLosNumerosEnListaFuncional:" );
	printAllNumbersInListFunctional ( números );
	sistema _ fuera _ println ( "\nimprimirNúmerosParesEnListaFuncional:" );
	printEvenNumbersInListFunctional ( números );
	sistema _ fuera _ println ( "\nimprimirCuadradosDeNumerosParesEnListaFuncional:" );
	printSquaresOfEvenNumbersInListFunctional ( números );
	sistema _ fuera _ imprimirln ( "" );
	}

	 impresión de vacío estático  privado ( número int ){  
		sistema _ fuera _ imprimir ( número + "," );
	}

	 booleano estático  privado isEven ( número int ){  
		retorno ( número % 2 == 0 );
	}

	privado  estático  vacío  printAllNumbersInListFunctional_Two ( Lista < Entero > números ){
		numeros _ corriente ()
		. forEach ( Sistema . salida :: imprimir );
		sistema _ fuera _ imprimirln ( "" );
	}

	privado  estático  vacío  printAllNumbersInListFunctional ( Lista < Entero > números ){
		numeros _ corriente ()
		. forEach ( Sistema . salida :: imprimir );
		sistema _ fuera _ imprimirln ( "" );
	}

	privado  estático  vacío  printEvenNumbersInListFunctional ( Lista < Entero > números ){
		numeros _ corriente ()
			. filtro ( FP_Functional_01 :: isEven )
			. forEach ( FP_Functional_01 :: imprimir );
		sistema _ fuera _ imprimirln ( "" );
	}

	privado  estático  vacío  printSquaresOfEvenNumbersInListFunctional ( Lista < Entero > números ){
		numeros _ corriente ()
			. filtro ( número -> número % 2 == 0 )
			. mapa ( número -> número * número )
			. forEach ( FP_Functional_01 :: imprimir );
		sistema _ fuera _ imprimirln ( "" );
	}
}