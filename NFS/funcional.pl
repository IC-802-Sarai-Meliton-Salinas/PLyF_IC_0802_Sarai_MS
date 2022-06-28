%Transiciones(A,E,B) -> Para pasar del estado A al estado B se requiere de una entrada E.
transición ( gonorte , t00 , gonorte ) .
transición ( gonorte , t01 , waitnorte ) .
transición ( gonorte , t10 , gonorte ) .
transición ( gonorte , t11 , waitnorte ) .

transicion ( waitnorte , t00 , goingte ) .
transicion ( waitnorte , t01 , goingte ) .
transicion ( waitnorte , t10 , goingte ) .
transición ( waitnorte , t11 , goingte ) .

transicion ( Goste , t00 , Goste ) .
transicion ( Goste , T01 , Goste ) .
transición ( goste , t10 , waiteste ) .
transición ( goste , t11 , waiteste ) .

transición ( waiteste , t00 , gonorte ) .
transición ( waiteste , t01 , gonorte ) .
transición ( waiteste , t10 , gonorte ) .
transición ( waiteste , t11 , gonorte ) .

%Estado inicial
inicio ( gonorte ) .

%Estado final
final ( gonorte ) .

%Regla para cambiar de estado
trans ( X ,[ A | B ]) :-  %Recibe como argumento un conjunto de entradas
      transicion( X , A , Y ), %Estado X ---Entrada A---> Estado Y
      escribe ( X ), %Escribe el estado
      escribe ( ' ' ), %Escribe un espacio
      escriba ([ A | B ]), %Escriba las entradas restantes
      nl , %Escribe un salto de linea
      trans( Y , B ) .  %Llama a otra función para determinar el fin de la FSM.

trans ( X , [ ] ) :-  %Mostrará el estado final de la maquina
      final( X ), % Se define un estado final
      escribe ( X ), %Escribe un estado X
      escribe ( ' ' ), %Escribe un espacio
      escribe ( [] ), %Escribe las entradas del estado
      nl _  % Salto de linea

% Regla que muestra los estados y transiciones de un conjunto de
% entradas.
entradas ( E ) :- inicio( S ), %La regla se cumple si hay un estado de inicio y
            trans( S , E ) .  %Hay un conjunto de entradas.