principal.java
clase  pública Principal { 
    public  static  void  main ( String [] args ) { 
        PruebaExamen  PE ; 
        
        PE = ( a , b , c ) -> Sistema . fuera _ println (( a + b + c ));
        educación física Operación_Prueba ( 2 , 4 , 6 );
        
        sistema _ fuera _ println ( PruebaExamen . Operacion_Prueba ( 8 , 10 )); 
        
        educación física mensaje_Hola (); 
        
        educación física mensaje_Hola ( "Hola mundo" );
        
        PE = ( a , b , c ) -> Sistema . fuera _ println (( a + ( b * c ))); 
        educación física Operacion_Prueba ( 5 , PruebaExamen . Operacion_Prueba ( 9 , 3 ), PruebaExamen . Operacion_Prueba ( 9 , 3 )); 

        mi_metodo( PE ); 
        
        mi_metodo (( a , b , c ) -> System . out . println (( a + ( b / c )))); 

        PE = ( a , b , c ) -> Sistema . fuera _ println ((( float ) a + (( float ) b / ( float ) c ))); 

        mi_metodo ( PE , 1 , 2 , 3 ); 
    }

    privado  static  void  mi_metodo ( PruebaExamen  PE ){
        educación física Operacion_Prueba ( 1 , PruebaExamen . Operacion_Prueba ( 2 , 2 ), PruebaExamen . Operacion_Prueba ( 3 , 3 )); 
    }
    private  static  void  mi_metodo ( PruebaExamen  PE , int  a , int  b , int  c ){
        educación física Operacion_Prueba ( a , PruebaExamen . Operacion_Prueba ( b , b ), PruebaExamen . Operacion_Prueba ( c , c )); 
    }
}