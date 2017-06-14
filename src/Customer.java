import java.util.ArrayList;
import java.util.List;

// �մ�
public class Customer {

	private String mvName;
	private List<String> movies = new ArrayList<String>();
	private List<String> mvTime = new ArrayList<String>();

	public Customer() {

	}

	public void findNewMovie(MovieDisplay mvDisplay) {
		System.out.println("Customer : MovieDisplay���� ���� ������ ��ȭ������ �޾ƿɴϴ�.");
		movies.addAll(mvDisplay.findCurrentMovies());
	}

	public void askMovieTime(Employee employee) {
		// ���Ƿ� ��ȭ�� �ϳ� �������ش�.
		mvName = movies.get(0);
		System.out.println("Customer : Employee���� '�̳�;߼�'��ȭ�� ����ʹٰ� ���մϴ�.");

		mvTime = employee.askMvTime(this, mvName);
	}

	public void reserveMovie(Employee employee) {
		System.out.println("Customer : '" + mvName + "' ��ȭ " + mvTime.get(0) + "�� ������ �ּ���");
		employee.reserveMovie(this, mvName, mvTime.get(0));
	}
}