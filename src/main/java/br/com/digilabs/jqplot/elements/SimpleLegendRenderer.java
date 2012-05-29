package br.com.digilabs.jqplot.elements;

public class SimpleLegendRenderer extends TableLegendRenderer
{

	private static final long serialVersionUID = 8356606085764904505L;
	
	private Integer numberRows;
	private Integer numberColumns;
	
	public Integer getNumberRows()
	{
		return numberRows;
	}
	public void setNumberRows(Integer numberRows)
	{
		this.numberRows = numberRows;
	}
	public Integer getNumberColumns()
	{
		return numberColumns;
	}
	public void setNumberColumns(Integer numberColumns)
	{
		this.numberColumns = numberColumns;
	}

}
