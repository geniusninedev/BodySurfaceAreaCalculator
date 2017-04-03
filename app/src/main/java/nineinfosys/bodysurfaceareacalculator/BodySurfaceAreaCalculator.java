package nineinfosys.bodysurfaceareacalculator;

public class BodySurfaceAreaCalculator {
	 	private double weight;
	 	private double  height;


	    public BodySurfaceAreaCalculator(double weight, double height) {
	    	 
	        this.weight = weight;
	        this.height = height;
	    
	    }

		public double getWeight() {
			return weight;
		}
		
		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		public double getHeight() {
			return height;
		}
		
		public void setHeight(double height) {
			this.height = height;
		}
	
		
        public float bsaCalculator()
		
		{
			float result=(float) Math.pow(height*weight/3600,0.5);
			return result;
			
			
		}
		/*public static class bodySurfaceAreaMain {
			
			public static void main(String arg[])
			{
				BodySurfaceAreaCalculator bsacal=new BodySurfaceAreaCalculator(152,78);
				double result=bsacal.bsaCalculator();
				System.out.print("body surface area Value:"+result);
		
			}
		}*/

}
