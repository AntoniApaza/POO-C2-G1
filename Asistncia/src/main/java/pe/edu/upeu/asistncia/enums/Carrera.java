package pe.edu.upeu.asistncia.enums;

public enum Carrera {
    SISTEMAS(Facultad.FIA),
    CIVIL(Facultad.FIA),
    AMBIENTAL(Facultad.FIA),

    ADMINISTRACION(Facultad.FCE),

    NUTRICION(Facultad.FCS),

    EDUCACION(Facultad.FACIEHD),

    GENERAL(Facultad.GENERAL);

    private Facultad facultad;

    Carrera(Facultad facultad) {
        this.facultad = facultad;
    }

    public Facultad getFacultad(){
        return facultad;
    }
}
