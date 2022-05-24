interfaz  pública PruebaExamen { 
	public  default  void  Mensaje_Hola (){ 
	}
	sistema _ fuera _ println ( "Hola mi nombre es: Sarai" ); 

	public  default  void  Mensaje_Hola ( String  cadena ){ 
		sistema _ fuera _ println ( "La cadena es: " + cadena );
	}

    public  static  int  Operacion_Prueba ( int  a , int  b ){ 
        devuelve  a + b ; 
    }

    public  void  Operacion_Prueba ( int  a , int  b , int  c ); 

}
