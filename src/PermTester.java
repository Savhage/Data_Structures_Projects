
public class PermTester {

	public static void main(String[] args) {
		Permutations p = new Permutations(); int
		reps = 5;
		int[] sizes = {12500, 25000, 50000, 100000, 200000, 400000,800000,1600000}; 
		for (int i= 0; i < sizes.length; i++) {
			long totalSteps = 0;
			double start = System.currentTimeMillis();
		
		for (int j = 0; j < reps; j++) {
			int[] data = new int[sizes[i]];
			p.algorithm2(data);
			totalSteps += p.getStepCounter();
		 }
		 double stop = System.currentTimeMillis();
		 System.out.println("" + sizes[i] + ", " + totalSteps/reps + ", " +(stop - start)/reps);
		}

	}

}
