package com.esame.util.filter;

import com.esame.model.Record;
import com.esame.util.other.Filter;
import com.esame.util.other.Filter2ParParent;

public class FilterEsCompPresIncluded  extends Filter2ParParent implements Filter  {
	
		
	public FilterEsCompPresIncluded(Object parametri) {
		super(parametri);
	}

	public boolean filter(Record record) {
		
		if( record.getEsCompPres() >= parametro1 & record.getEsCompPres() <= parametro2) {
			return true;
		}
		return false;
	}
}
	