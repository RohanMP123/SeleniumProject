package KeyWordDriverFrameWork;

import java.io.IOException;

public class BaseTast {

	public static void main(String[] args) throws IOException {
		Flib flib = new Flib();
		flib.readPropertyFile("./data/config.properties", "browser");
	}

}
