0# incluir  < stdio.h >
# incluir  < stdlib.h >
// Declaración de estados
# definir  irNorte  0
# definir  esperarNorte  1
# definir  goEste  2
# definir  esperarEste  3

// Declaracion de transiciones
# definir  t00  0
# definir  t01  1
# definir  t10  2
# definir  t11  3

// Estado inicial
int estado=irNorte;

// Conjunto de entradas que recibira la maquina
int eventos[ 11 ]={t00,t01,t01,t10,t11,t00,t00,t01,t11,t10,t10};

int  principal ( int argc, char  const *argv[]){
    int i= 0 ;
    while (i< 11 ){ // Comprueba la posición de los estados
        switch (eventos[i]){ // Si la transción se cumple imprimirá el estado en que se encuentra
            caso t00:
                if (estado==irNorte){
                    estado=irNorte;
                    printf ( " irNorte \n " );
                } else  if (estado==esperarNorte){
                    estado=goEste;
                    printf ( " goEste \n " );
                } else  if (estado==goEste){
                    estado=goEste;
                    printf ( " goEste 3s \n " );
                } else  if (estado==esperarEste){
                    estado=irNorte;
                    printf ( " irNorte \n " );
                }
                romper ;
            caso t01:
                if (estado==irNorte){
                    estado=esperarNorte;
                    printf ( " esperaNorte \n " );
                } else  if (estado==esperarNorte){
                    estado=goEste;
                    printf ( " goEste \n " );
                } else  if (estado==goEste){
                    estado=goEste;
                    printf ( " goEste \n " );
                } else  if (estado==esperarEste){
                    estado=irNorte;
                    printf ( " irNorte \n " );
                }
                romper ;
            caso t10:
                if (estado==irNorte){
                    estado=irNorte;
                    printf ( " irNorte \n " );
                } else  if (estado==esperarNorte){
                    estado=goEste;
                    printf ( " goEste \n " );
                } else  if (estado==goEste){
                    estado=esperarEste;
                    printf ( " esperarEste \n " );
                } else  if (estado==esperarEste){
                    estado=irNorte;
                    printf ( " irNorte \n " );
                }
                romper ;
            caso t11:
                if (estado==irNorte){
                    estado=esperarNorte;
                    printf ( " esperaNorte \n " );
                } else  if (estado==esperarNorte){
                    estado=goEste;
                    printf ( " goEste \n " );
                } else  if (estado==goEste){
                    estado=esperarEste;
                    printf ( " esperarEste \n " );
                } else  if (estado==esperarEste){
                    estado=irNorte;
                    printf ( " irNorte \n " );
                }
                romper ;
            predeterminado :
                romper ;
        }
        // Cuando se cumpla la transicion la maquina avanzara al siguiente estado hasta salir de la maquina
        yo++;
    }    
    devolver  0 ;
}