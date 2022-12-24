package com.bentley.system;

public class AsciiArt {

	public static void main(String[] args) {
		int N = 4;
		for(int i = 2;i<=N;i++) {
			System.out.println('L');
			if(i==N) {
				while(N>0) {
					System.out.print('L');
					N--;
				}
			}
		}
	}
}
// postgresql query for count of employees in each dept and sum of salary in each dept
// select d.dept_id, count(e.emp_id) as count,sum(e.salary) as sum_of_salary
// from department d, employee e
// where d.dept_id = e.dept_id
// group by d.dept_id
// order by d.dept_id;