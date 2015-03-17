enum OcrDigit {
	
	ZERO(' _ ' +
	     '| |' +
		 '|_|'),
		
	ONE('   ' +
		'  |' +
		'  |'),
		
	TWO(' _ ' +
		' _|' +
		'|_ '),
		 
	THREE(' _ ' +
		  ' _|' +
		  ' _|'),
		  
	FOUR('   ' +
		 '|_|' +
	     '  |'),
		 
	FIVE(' _ ' +
		 '|_ ' +
		 ' _|'),
		 
	SIX(' _ ' +
	    '|_ ' +
		'|_|'),
	
	SEVEN(' _ ' +
		  '  |' +
		  '  |'),
		   
	EIGHT(' _ ' +
		  '|_|' +
		  '|_|'),
		
	NINE(' _ ' +
		 '|_|' +
		 ' _|')
		
	static Map ocrToDecMap = [ (ONE.ocrString) :'1', (TWO.ocrString) :'2', (THREE.ocrString):'3',
                               (FOUR.ocrString):'4', (FIVE.ocrString):'5', (SIX.ocrString):'6',
                               (SEVEN.ocrString):'7', (EIGHT.ocrString):'8',(NINE.ocrString):'9', 
							   (ZERO.ocrString):'0']
	
	static Map decToOcrMap = ocrToDecMap.collectEntries {k,v -> [(v):k]}
	
	String ocrString
	
	OcrDigit(String ocrString) {
		this.ocrString = ocrString
	}
	
	/**
	 * Given an OCR Digit, return a string that contains decimal value.
	 * If the string doesn't match any of the OCR numbers, return the question mark character.
	 *
	 * @param s - the 9 character string representing an OCR Digit
	 * @return a string containing the decimal value of the OCR Digit
	 */
	static String ocrToDecimal(String s ) {
		ocrToDecMap[s]
	}
	
	static String decimalToOcr( String s ) {
		decToOcrMap[s]
	}	
}
