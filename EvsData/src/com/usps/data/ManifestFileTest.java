package com.usps.data;

import com.evs.data.util.DataUtil;
import com.usps.evs.vo.ManifestDetail;
import com.usps.evs.vo.ManifestHeader;

public class ManifestFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String H1 = "H1|9275012821237546329520|1|20131225|121303||20260|0000|||||020|201312250000|9999|2.0.1|000000049|128212375|";
		String D1 = "D1|4202026000009217912821237522693450|FC|179|C01|20260|0000||||||128212375||||||||||000|0000|1|01|20148|||0001000|P|||1|000001191|3|3D|N|00|00000|00000|00000|000000||000000||000000||000000||000000||000000|0000000|000000|0000||0000000||0000000|||0000000|000000000||0||N|N|1|00||||||||||||||||";
		System.out.println(DataUtil.getFileVersion(H1));
		ManifestHeaderProcessor header = new ManifestHeaderProcessor();
		ManifestHeader header1 = header.parseHeaderLine(H1);
		ManifestDetailProcessor detail = new ManifestDetailProcessor();
		ManifestDetail detail1 = detail.parseDetailLine(D1);
		System.out.println(header1.toString());System.out.println(detail1.toString());
		
		
	}

}
