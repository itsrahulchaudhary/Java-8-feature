package in.rahulit.beans;

public class Sample {

	public static void main(String[] args) {
		// SampleInterface si = () -> new Sample();
		SampleInterface si = Sample::new;
		System.out.println(si.hashCode());
	}

}

interface SampleInterface {
	Sample get();
}