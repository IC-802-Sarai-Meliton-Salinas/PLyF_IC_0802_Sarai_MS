Ejemplo Familia

padrede('Juan','Maria').
padrede('Pablo','Juan').
padrede('Pablo','Marcela').
padrede('Carlos','Debora').

hijode(A,B) :- padrede(B,A).
abuelode(A,B) :- padrede(A,C), padrede(C,B).
hermanode(A,B) :- padrede(A,C), padrede(C,B),A\== B.



