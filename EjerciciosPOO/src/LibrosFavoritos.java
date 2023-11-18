public class LibrosFavoritos {
    public static void main(String[] args) throws Exception{
        Libro libro1 = new Libro("978-8441532106", "Clean Code", "Robert C. Martin", 464);
        Libro libro2 = new Libro("978-8420660981", "Marianela", "Benito P. Galdos", 224);

        libro1.mostrar();
        libro2.mostrar();

        if(libro1.getNum_paginas() > libro2.getNum_paginas()) {
            System.out.println("El libro \"" + libro1.getTitulo() + "\" tiene más páginas.");
        } else if(libro1.getNum_paginas() < libro2.getNum_paginas()) {
            System.out.println("El libro \"" + libro2.getTitulo() + "\" tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen el mismo número de páginas.");
        }
    }
}