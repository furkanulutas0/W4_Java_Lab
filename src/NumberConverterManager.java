public class NumberConverterManager implements INumberConverterManager {

  private final String[] ones = { "", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz" };
  private final String[] tens = { "", "On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", "Seksen", "Doksan" };

  @Override
  public String convertToWords(int number) {
    if (number < 0 || number > 100000) {
      return "Geçersiz giriş";
    }

    if (number == 0) {
      return "Sıfır";
    }
    try {
      return convert(number);
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  private String convert(int number) {
    if (number < 10) {
      return ones[number];
    } else if (number < 100) {
      return tens[number / 10] + " " + convert(number % 10);
    } else if (number < 1000) {
      return ones[number / 100] + " Yüz " + convert(number % 100);
    } else if (number < 10000) {
      return ones[number / 1000] + " Bin " + convert(number % 1000);
    } else {
      return tens[number / 10000] + " " + ones[number / 1000 % 10] + " Bin " + convert(number % 1000);
    }
  }
}
