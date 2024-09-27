package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");

        // Encender la TV con el mando rojo
        redRemote.turnOn();

        // Subir y bajar el canal
        redRemote.channelUp();
        System.out.println("Canal actual (después de subir): " + redRemote.getChannel());

        redRemote.channelDown();
        System.out.println("Canal actual (después de bajar): " + redRemote.getChannel());

        // Intentar bajar el canal cuando ya está en 0
        redRemote.channelDown();
        System.out.println("Canal actual (después de intentar bajar en 0): " + redRemote.getChannel());

        // Subir y bajar el volumen
        redRemote.volumeUp();
        System.out.println("Volumen actual (después de subir): " + redRemote.getVolume());

        redRemote.volumeDown();
        System.out.println("Volumen actual (después de bajar): " + redRemote.getVolume());

        // Intentar bajar el volumen cuando ya está en 0
        redRemote.volumeDown();
        System.out.println("Volumen actual (después de intentar bajar en 0): " + redRemote.getVolume());

        // Obtener y mostrar el color del mando
        System.out.println("El color del mando es: " + redRemote.getColor());

        // Apagar la TV
        redRemote.turnOff();
    }
}
