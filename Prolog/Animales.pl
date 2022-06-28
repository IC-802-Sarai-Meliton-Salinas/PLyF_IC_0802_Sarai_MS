gato(macorina).
gato(lui).
gato(felix).
gato(ambar).
gato(sparky).
gato(luna).

perro(solovino).
perro(firulais).
perro(macorina).


color_gato(macorina,foca).
color_gato(luna,negro).
color_gato(lui,negro).
color_gato(sparky,negro).
color_gato(ambar,tricolor).
color_gato(felix,tricolor).

animal(A) :- gato(A).
perro_gato(A) :- gato(A), perro(A).
color_perro(A,B) :- perro(A), color_gato(A,B).


