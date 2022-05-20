clase  pública FP_Functional_Exercise_2 {
	public  static  void  main ( String [] args ){
	Lista < Cadena > cursos = Lista . de ( "Spring" , "Spring Boot" , "API" , "Microservicios" , "AWS" , "PCF" , "Azure" , "Docker" , "Kubernetes" );


	sistema _ fuera _ println ( "imprimirTodosLosCursosEnLaLista:" );
	imprimirTodosLosCursos ( cursos );
	sistema _ fuera _ imprimirln ( "" );
	}

	 printl de vacío estático  privado ( curso de cadena ) {  
		sistema _ fuera _ println ( curso + "," );
	}

	private  static  void  printAllCourses ( Lista < String > cursos ){
		cursos _ corriente ()
		. forEach ( Sistema . fuera :: println );
		sistema _ fuera _ imprimirln ( "" );
	}
}