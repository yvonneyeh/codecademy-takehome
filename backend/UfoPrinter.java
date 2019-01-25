import java.util.*;

public class UfoPrinter {

  public static void main(String[] args) {
    List<String> frames = UfoPrinter.ufoFrames();

    for (String frame : frames) {
      System.out.println(frame);
    }
  }

  public static List<String> ufoFrames() {
    List<String> ufoFrames = new ArrayList<String>();
    StringBuilder sb = new StringBuilder();

    sb.append("                  .\n")
      .append("                  |\n")
      .append("               .-\"^\"-.\n")
      .append("              /_....._\\\n")
      .append("          .-\"`         `\"-.\n")
      .append("         (  ooo  ooo  ooo  )\n")
      .append("          '-.,_________,.-'\n")
      .append("               /     \\\n")
      .append("              /       \\\n")
      .append("             /    O    \\\n")
      .append("            /   --|--   \\\n")
      .append("           /      |      \\\n")
      .append("          /      / \\      \\\n");

    ufoFrames.add(sb.toString());
    
    sb = new StringBuilder();
    sb.append("                  .\n")
      .append("                  |\n")
      .append("               .-\"^\"-.\n")
      .append("              /_....._\\\n")
      .append("          .-\"`         `\"-.\n")
      .append("         (  ooo  ooo  ooo  )\n")
      .append("          '-.,_________,.-'\n")
      .append("               /     \\\n")
      .append("              /   O   \\\n")
      .append("             /  --|--  \\\n")
      .append("            /     |     \\\n")
      .append("           /     / \\     \\\n")
      .append("          /               \\\n");

    ufoFrames.add(sb.toString());
    
    sb = new StringBuilder();
    sb.append("                  .\n")
      .append("                  |\n")
      .append("               .-\"^\"-.\n")
      .append("              /_....._\\\n")
      .append("          .-\"`         `\"-.\n")
      .append("         (  ooo  ooo  ooo  )\n")
      .append("          '-.,_________,.-'\n")
      .append("               /  O  \\\n")
      .append("              / --|-- \\\n")
      .append("             /    |    \\\n")
      .append("            /    / \\    \\\n")
      .append("           /             \\\n")
      .append("          /               \\\n");

    ufoFrames.add(sb.toString());
    
    sb = new StringBuilder();
    sb.append("                  .\n")
      .append("                  |\n")
      .append("               .-\"^\"-.\n")
      .append("              /_....._\\\n")
      .append("          .-\"`         `\"-.\n")
      .append("         (  ooo  ooo  ooo  )\n")
      .append("          '-.,_________,.-'\n")
      .append("               /--|--\\\n")
      .append("              /   |   \\\n")
      .append("             /   / \\   \\\n")
      .append("            /           \\\n")
      .append("           /             \\\n")
      .append("          /               \\\n");

    ufoFrames.add(sb.toString());
    
    sb = new StringBuilder();
    sb.append("                  .\n")
      .append("                  |\n")
      .append("               .-\"^\"-.\n")
      .append("              /_....._\\\n")
      .append("          .-\"`         `\"-.\n")
      .append("         (  ooo  ooo  ooo  )\n")
      .append("          '-.,_________,.-'\n")
      .append("               /  |  \\\n")
      .append("              /  / \\  \\\n")
      .append("             /         \\\n")
      .append("            /           \\\n")
      .append("           /             \\\n")
      .append("          /               \\\n");

    ufoFrames.add(sb.toString());
    
    sb = new StringBuilder();
    sb.append("                  .\n")
      .append("                  |\n")
      .append("               .-\"^\"-.\n")
      .append("              /_....._\\\n")
      .append("          .-\"`         `\"-.\n")
      .append("         (  ooo  ooo  ooo  )\n")
      .append("          '-.,_________,.-'\n")
      .append("               / / \\ \\\n")
      .append("              /       \\\n")
      .append("             /         \\\n")
      .append("            /           \\\n")
      .append("           /             \\\n")
      .append("          /               \\\n");


    ufoFrames.add(sb.toString());
    
    sb = new StringBuilder();
    sb.append("                  .\n")
      .append("                  |\n")
      .append("               .-\"^\"-.\n")
      .append("              /_....._\\\n")
      .append("          .-\"`         `\"-.\n")
      .append("         (  ooo  ooo  ooo  )\n")
      .append("          '-.,_________,.-'\n")
      .append("               /     \\\n")
      .append("              /       \\\n")
      .append("             /         \\\n")
      .append("            /           \\\n")
      .append("           /             \\\n")
      .append("          /               \\\n");

    ufoFrames.add(sb.toString());

    return ufoFrames;
  }
}
