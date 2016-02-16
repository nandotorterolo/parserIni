Se pretende un parser hecho en Java con CUP para archivos en formato INI. Se trata de
listas clave=valor dentro de secciones. Cada clave es un nombre compuesto por letras. Un
valor puede estar compuesto por cualquier caracter que no sea un fin de línea, y no debe
comenzar con un espacio en blanco. Cada sección está encabezada por un nombre entre
paréntesis rectos. 

[owner]
name=asfdas asd fsa
organization=asfd asdf.

[database]
server=192.293
port=12
file="safdas"

Suponiendo el análisis léxico resuelto (con JFlex) escribir las definiciones para generar un
parser para el lenguaje dado con CUP. Incluir las definiciones de símbolos terminales y no
terminales, así como precedencias y asociatividades.
El resultado del análisis sintáctico debe ser siempre un HashMap<String,
HashMap<String, String>>