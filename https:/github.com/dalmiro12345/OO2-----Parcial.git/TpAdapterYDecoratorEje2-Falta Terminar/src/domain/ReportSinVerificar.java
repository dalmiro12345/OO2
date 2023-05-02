package domain;

import java.io.File;

public class ReportSinVerificar implements Export {

	private Export export;

	public ReportSinVerificar(Export export) {
		super();
		this.export = export;
	}

	@Override
	public void export(File file) {
		// TODO Auto-generated method stub
		
		this.export.export(file);
	}

}
