package final_hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class final_hw {
    public static void main(String[] args) {
		List<Notebook> notebooks = createListNotebooks();
		HashMap<Integer, String> parameters = criteriasOfSearch();
		filter(parameters, notebooks);
	}

    public static ArrayList<Notebook> createListNotebooks() {
        ArrayList<Notebook> notebooks = new ArrayList<>();
        Notebook lp1 = new Notebook(null, null, null, 0, 0, null, 0, null);
        lp1.setBrand("Lenovo");
        lp1.setModel("Legion 5 15ACH6");
        lp1.setCpu("AMD");
        lp1.setDiagonal(15.6);
        lp1.setRam(8);
        lp1.setIsGaming(true);
        lp1.setPrice(100000);
        lp1.setColor("white");

        Notebook lp2 = new Notebook("HP","Pavilion 14-dv0041ur", "Intel", 14, 4, false, 50000, "grey");
        Notebook lp3 = new Notebook("ASUS","Zenbook Flip S Oled", "Intel", 13.3, 16, false, 105000, "black");
        Notebook lp4 = new Notebook("GIGABYTE","Aero 15", "Intel", 15.6, 16, true, 133000, "black");
        Notebook lp5 = new Notebook("LENOVO","Yoga Slim 7", "Amd", 15.6, 16, false, 113320, "pink");
        Notebook lp6 = new Notebook("Alienware","M15R5", "Amd", 15.6, 16, true, 200000, "black");
        Notebook lp7 = new Notebook("HP","Envy 13-ba0023ur", "Intel", 13.3, 8, false, 84310, "white");
        Notebook lp8 = new Notebook("Dell","XPS 15", "Intel", 15.6, 32, true, 220000, "grey");
        Notebook lp9 = new Notebook("ASUS","ROG STRIX G15", "AMD", 15.6, 16, true, 140000, "black");
        Notebook lp10 = new Notebook("LG","Gram 17", "Intel", 17, 16, false, 57000, "black");

		notebooks.add(lp1);
		notebooks.add(lp2);
        notebooks.add(lp3);
        notebooks.add(lp4);
		notebooks.add(lp5);
        notebooks.add(lp6);
        notebooks.add(lp7);
		notebooks.add(lp8);
        notebooks.add(lp9);
        notebooks.add(lp10);

		return notebooks;
    }

    public static HashMap<Integer, String> criteriasOfSearch() {
		Scanner scanner = new Scanner(System.in);

		HashMap<Integer, String> map = new HashMap<>();
        boolean flag = true;

		while (flag) {
			System.out.println(
					"Введите цифру, соответствующую необходимому критерию: \n1 - Процессор\n2 - Диагональ экрана\n3 - Объем оперативной памяти, Гб\n4 - Игровой ноутбук (1 - да, 0 - нет)\n5 - Цена\n6 - Цвет(на англ раскладке)\n7 - Завершить и вывести результаты поиска");
			int inputInt = scanner.nextInt();
			scanner.nextLine();

            if (inputInt < 1 || inputInt > 7) {
                System.out.println("Попробуйте ввести другое значение параметра поиска");
            } else if (inputInt != 7)  {
                System.out.println("Введите значение параметра: ");
				String param = scanner.nextLine();
				map.put(inputInt, param);
			} else flag = false; 
		}
		return map;
	}

    public static void filter(HashMap<Integer, String> parameters, List<Notebook> notebooks) {
		System.out.println("Результаты поиска: ");

		for (Notebook lp : notebooks) {
			boolean isMatch = true;
			for (int key : parameters.keySet()) {
				switch (key) {
					case (1):
						if (!lp.cpu.equalsIgnoreCase(parameters.get(key))) {
							isMatch = false;
						}
						break;
					case (2):
						if (lp.diagonal < Double.parseDouble(parameters.get(key))) {
							isMatch = false;
						}
						break;
					case (3):
						if (lp.ram < Integer.parseInt(parameters.get(key))) {
							isMatch = false;
						}
						break;
                    case (4):
						if (lp.isGaming.equals(Boolean.parseBoolean(parameters.get(key)))) {
							isMatch = false;
						}
						break;
                    case (5):
						if (lp.price < Integer.parseInt(parameters.get(key))) {
							isMatch = false;
						}
						break;
                    case (6):
						if (!lp.color.equalsIgnoreCase(parameters.get(key))) {
							isMatch = false;
						}
						break;
				}
			}
			if (isMatch) {
				lp.getAll();
			}
		}
	}
}