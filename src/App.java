class Personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int vida_hp;

    public Personaje(String nombre, int fuerza, int velocidad, int vida_hp) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
    }

    public void mostrarEstadisticas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Vida: " + vida_hp);
    }
}
class SuperHero extends Personaje {
    public SuperHero(String nombre, int fuerza, int velocidad, int vida_hp) {
        super(nombre, fuerza, velocidad, vida_hp);
    }

    public void atacar(Personaje oponente) {
        oponente.vida_hp -= this.fuerza;
        System.out.println(this.nombre + " ataca a " + oponente.nombre + " y reduce su vida a " + oponente.vida_hp);
    }

    public void defender() {
        this.vida_hp += this.vida_hp * 0.5; // Aumenta el 50% del daño recibido
        System.out.println(this.nombre + " se defiende y su vida aumenta a " + this.vida_hp);
    }

    public void aumentarPoderes() {
        this.fuerza += 40; // Ejemplo de aumentar poderes
        System.out.println(this.nombre + " aumenta sus poderes. Nueva fuerza: " + this.fuerza);
    }

    public void recuperarse() {
        this.vida_hp += 20; // Recupera 20 puntos de vida
        System.out.println(this.nombre + " se recupera. Nueva vida: " + this.vida_hp);
    }

    @Override
    public void mostrarEstadisticas() {
        super.mostrarEstadisticas();
        System.out.println("Rol: SuperHeroe");
    }
}
class Villano extends Personaje {
    public Villano(String nombre, int fuerza, int velocidad, int vida_hp) {
        super(nombre, fuerza, velocidad, vida_hp);
    }

    public void hacerTrampa() {
        this.vida_hp *= 2; // Duplicar vida
        System.out.println(this.nombre + " hace trampa y duplica su vida. Nueva vida: " + this.vida_hp);
    }

    @Override
    public void mostrarEstadisticas() {
        super.mostrarEstadisticas();
        System.out.println("Rol: Villano");
    }
}
