package com.example.myapplication

fun main(){


    var auto1 = Vehiculo2()

    auto1.marca="Chevrolet"
    auto1.anio=2016
    auto1.Patente="AA444PO"
    auto1.modelo="Onix"

    var auto2 = Vehiculo2("Fiat","Cubo","AA555RE",2017,false,30,500
        ,true)



    //print("\nVehiculo Marca: ${auto1.marca} \nModelo: ${auto1.modelo} \nAño: ${auto1.anio} \nPatente: ${auto1.Patente} \n")
    print("\nVehiculo Marca: ${auto2.marca} \nModelo: ${auto2.modelo} \nAño: ${auto2.anio} \nPatente: ${auto2.Patente} \n")

    //auto1.encender()
    //auto1.apagar()
    //auto1.EstadoDeEncendido()

    if (auto2.Kilometraje>5000){
        auto2.encender()
        auto2.EstadoDeEncendido()
        auto2.mover2()

        //auto2.apagar()
        // auto2.EstadoDeEncendido()
    }
    else{
        println("vehiculo no habilitado")}




}