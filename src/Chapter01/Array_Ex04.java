package Chapter01;

// DNA 염기 서열 분석
// 문자열에서 특정 문자 몇 번 나왔는지 카운트하기

public class Array_Ex04 {
    public static void main(String[] args){
        int tagg = 0, ccag = 0, agcc = 0;
        String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";

        char[] charArray = dna.toCharArray(); // dna 문자열을 한글자씩 charArray 배열에 넣은 상태

        char[] current = new char[4]; // 배열에서 4칸씩 가져와 문자열로 변환 후 비교할 것.

        for (int i = 0; i< charArray.length-3; i++){ // 4글자씩 비교하기 때문에 끝에서 3번째부터는 비교할 필요 x.
            for (int j = 0; j< current.length; j++){ // 4글자씩 담는다.
                current[j] = charArray[i+j];
            }

            String result = new String(current); // 4글자씩 담은 char 배열을 문자열로 변환.

            switch (result){
                case "TAGG":
                    tagg += 1;
                    break;
                case "CCAG":
                    ccag += 1;
                    break;
                case "AGCC":
                    agcc += 1;
                    break;
                default:
                    break;
            }
        }

        System.out.println("tagg = " + tagg);
        System.out.println("ccag = " + ccag);
        System.out.println("agcc = " + agcc);
    }
}
