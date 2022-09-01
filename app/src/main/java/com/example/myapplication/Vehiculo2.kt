package com.example.myapplication

import java.util.concurrent.DelayQueue
import java.util.concurrent.Delayed
import kotlin.concurrent.thread

class Vehiculo2 {

    var marca : String = ""
        get() = field
        set(value) { 
            field = value
        }
    var modelo : String = ""
    var Patente : String = ""
    var anio : Int  = 0
    var encendido : Boolean = false
    var velocidad: Int = 0
    var Kilometraje: Int = 0
        get() = field
        set(value) { if (value<=5000){
            println("Su vehiculo no necesita Realizar la vtv")
            return
        }
            else    {field = value}

        }
    var habilitado = true

    constructor()

    constructor( marca:String, modelo : String, patente: String, anio : Int, encendido: Boolean,velocidad: Int ,kilometraje: Int,habilitado : Boolean  ){
        this.marca=marca
        this.modelo=modelo
        this.Patente=patente
        this.anio=anio
        this.encendido=encendido
        this.velocidad=velocidad
        this.Kilometraje=kilometraje
        this.habilitado=habilitado

   }

    fun encender(){
        encendido = true
    }

    fun apagar(){
        if (encendido==false){
            println("El Vehiculo YA esta Apagado ")
        }
        else{encendido = false}

    }

    fun EstadoDeEncendido(){
        if (encendido==true){
        println("El Vehiculo esta Encendido ")}
        else{
            println("El Vehiculo esta Apagado ")
        }
    }

    //fun mover(move : Int): Int {
      //  var kilometrosmov = 0 ;
       // if (encendido==false) { println("El Vehiculo esta Apagado no puede moverse ") }
      //  else{ kilometrosmov  = move ;}
     //   return kilometrosmov }

    fun mover2() {

        print("La velocidad actual es ${this.velocidad}\n")
            while (this.velocidad>20){
                this.velocidad=this.velocidad-1
                print("La velocidad actual es ${this.velocidad}\n")
                Thread.sleep(600)
            }
            while (this.velocidad<20){
                this.velocidad=this.velocidad+1
                 print("La velocidad actual es ${this.velocidad}\n")
                Thread.sleep(600)
                    }
        print("la velocidad de vehiculo Ha sido regulada ")

        }


}