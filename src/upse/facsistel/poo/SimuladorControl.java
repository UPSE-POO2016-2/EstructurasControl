package upse.facsistel.poo;

import upse.facsistel.academico.*;
import java.awt.Cursor;
import java.io.IOException;
import java.util.Random;

public class SimuladorControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Curso poo = null;
		Carrera sistemas = new Carrera("Sistemas");
		
		Curso poo = new Curso(4001, "Programacion "
				+ "Orientada a Objetos");
		
		Estudiante Kerly = new Estudiante("Kerly ABC");
		poo.inscribirEstudiante(Kerly);
		
		Estudiante Dinner = new Estudiante("Dinner XYZ");
		poo.inscribirEstudiante(Dinner);
		
		Estudiante Jazmin = new Estudiante("Jazmin Limon", "JL", "Sistemas");
		poo.inscribirEstudiante(Jazmin);
		
		Curso metodosNumericos = new Curso(4002, "Metodos Numericos");
		metodosNumericos.inscribirEstudiante(Jazmin);
		
		Estudiante Wilson = new Estudiante("Wilson Mazzini");
		metodosNumericos.inscribirEstudiante(Wilson);
		
		sistemas.agregarMateria(poo);
		sistemas.agregarMateria(metodosNumericos);
		
		for(Curso c: sistemas.getMaterias())
		{
			System.out.println("La materia " + 
		c.getNombreCurso() +" tiene inscrito a:" );
			c.imprimirListaEstudiantes();
		}
	}

}
