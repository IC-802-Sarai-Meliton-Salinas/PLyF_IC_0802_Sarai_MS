clase  pública FP_Functional_Exercise_5 {
	public  static  void  main ( String [] args ){
	Lista < Entero > números = Lista . de ( 12 , 9 , 13 , 4 , 6 , 2 , 4 , 12 , 15 );


	sistema _ fuera _ println ( "imprimirTodosLosNumerosEnLaLista:" );
	printAllNumbersInListFunctional ( números );
	sistema _ fuera _ println ( "\nimprimirNúmerosImparesEnListaFuncional:" );
	imprimirNúmerosImparesEnListaFuncional ( números );
	sistema _ fuera _ println ( "\nimprimirCubosDeNumerosParesEnListaFuncional:" );
	printCubesOfOddNumbersInListFunctional ( números );
	sistema _ fuera _ imprimirln ( "" );
	}

	 impresión de vacío estático  privado ( número int ){  
		sistema _ fuera _ imprimir ( número + "," );
	}

	 isOdd booleano estático  privado ( número int ){  
		retorno ( número % 2 != 0 );
	}

	privado  estático  vacío  printAllNumbersInListFunctional ( Lista < Entero > números ){
		numeros _ corriente ()
		. forEach ( Sistema . salida :: imprimir );
		sistema _ fuera _ imprimirln ( "" );
	}

	privado  static  void  printOddNumbersInListFunctional ( Lista < Entero > números ){
		numeros _ corriente ()
			. filtro ( FP_Functional_Exercise_05 :: isOdd )
			. forEach ( FP_Functional_Exercise_05 :: imprimir );
		sistema _ fuera _ imprimirln ( "" );
	}

	 printCubesOfOddNumbersInListFunctional vacío estático  privado ( Lista < Entero > números ){ 
		numeros _ corriente ()
			. filtro ( número -> número % 2 != 0 )
			. mapa ( número -> número * número * número )
			. forEach ( FP_Functional_Exercise_05 :: imprimir );
		sistema _ fuera _ imprimirln ( "" );
	}
}