clase  pública FP_Functional_Exercise_3 {
	public  static  void  main ( String [] args ){
	Lista < Cadena > cursos = Lista . de ( "Spring" , "Spring Boot" , "API" , "Microservicios" , "AWS" , "PCF" , "Azure" , "Docker" , "Kubernetes" );


	sistema _ fuera _ println ( "imprimirCursosConPrimavera:" );
	printCoursesWithSpring ( cursos );
	sistema _ fuera _ imprimirln ( "" );
	}

	 impresión de vacío estático  privado ( curso de cadena ) {  
		sistema _ fuera _ println ( curso + "," );
	}

	private  static  void  printCoursesWithSpring ( Lista < String > cursos ){
		cursos _ corriente ()
		. filtro ( curso -> curso . comienza con ( "Primavera" ))
    	. forEach ( Sistema . fuera :: println );
		sistema _ fuera _ imprimirln ( "" );
	}
}