package app.weather.local.core.document;

import app.weather.local.core.document.enums.EAnalise;

import java.util.List;

public class Usuario {
    private String id;
    private List<Local> local;
    private Dispositivo dispositivo;
    private EAnalise analise;
}
