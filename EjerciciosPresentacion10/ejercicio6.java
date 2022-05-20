clase  pública FP_Functional_Exercise_6 {
	public  static  void  main ( String [] args ){
	Lista < Cadena > cursos = Lista . de ( "Spring" , "Spring Boot" , "API" , "Microservicios" , "AWS" , "PCF" , "Azure" , "Docker" , "Kubernetes" );


	sistema _ fuera _ println ( "imprimirCursosAlMenosCuatroLetras:" );
	imprimirCursosAlMenosCuatroLetras ( cursos );
	sistema _ fuera _ imprimirln ( "" );
	}

	 impresión de vacío estático  privado ( curso de cadena ) {  
		sistema _ fuera _ println ( curso + "," );
	}

	 printCoursesAtLeastFourLetters privado estático  vacío  ( Lista < String > cursos ){
		cursos _ corriente ()
    	. forEach ( curso -> System . out . println ( "El curso " + curso + " tiene " + curso . longitud () + " caracteres" ));
		sistema _ fuera _ imprimirln ( "" );
	}
}