package b1722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 순열의순서 {
	public static void main(String[] args) throws IOException {
		int n, q;
		long f[] = new long[21];
		int s[] = new int[21];
		boolean visit[] = new boolean[21];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        q = Integer.parseInt(st.nextToken());
        f[0]=1;
        
        for(int i=1; i<=n;i++) {
        	f[i] = f[i-1]*i;
        }//팩토리얼 초기화 => 각 자리수에서 만들 수 있는 경우의 수 
        if(q==1) {
        	long k = Long.parseLong(st.nextToken());
        	for (int i = 0; i <= n; i++) {
				for (int j = 0, cnt=1; j <= n; j++) {
					if (visit[j])
						continue;
					if (k<=cnt*f[n-i]) {
						k = k-((cnt-1)*f[n-i]);
						s[i]=j;
						visit[j]=true;
						break;
					} 
					cnt++;
					}
				}
				for (int i = 1; i < n; i++) {
					System.out.println(s[i]+" ");
				}
			}else {
				long k =1;
				for(int i=1;i<=n;i++) {
					s[i]=Integer.parseInt(st.nextToken());
					long cnt = 0;
					for(int j = 1; j<s[i];j++) {
						if(visit[j]==false) {
							cnt++;
						}
					}
					k+=cnt*f[n-i];
					visit[s[i]]=true;
				}
				System.out.println(k);
			}   
	}
}
