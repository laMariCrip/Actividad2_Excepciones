class Persona {
    private int edad;

    public Persona() {
    }

    public void setEdad(int edad) throws EdadNoValidaException {                                    //metodo set que lanza excepcion
        if (edad < 0 || edad > 120) {
            throw new EdadNoValidaException("La edad no puede ser menor de 0 ni mayor de 120!");   //devuelve la excepcion con su mensaje
        }else {
            System.out.println("La edad de " + edad + " es correcta!");                             //devuelve un mensaje
        }
        this.edad = edad;
    }
}