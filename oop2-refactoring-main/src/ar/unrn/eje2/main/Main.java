package ar.unrn.eje2.main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import ar.unrn.eje2.Recaudacion;

public class Main {

	public static void main(String[] args) {
		try {
			Map<String, String> options = new HashMap<String, String>();
			options.put("company_name", "Facebook");
			options.put("round", "a");
			System.out.print(Recaudacion.where(options).size());
		} catch (IOException e) {
			System.out.print(e.getMessage());
			System.out.print("error");
		}
	}

}
