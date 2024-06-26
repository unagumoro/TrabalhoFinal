import java.util.Map;

public class Vocacao {
    public static String determinarVocacao(Map<Personalidade, Integer> pontuacoes) {
        int pontuacaoE = Personalidade.E.getPontuacao();
        int pontuacaoI = Personalidade.I.getPontuacao();
        int pontuacaoS = Personalidade.S.getPontuacao();
        int pontuacaoN = Personalidade.N.getPontuacao();
        int pontuacaoT = Personalidade.T.getPontuacao();
        int pontuacaoF = Personalidade.F.getPontuacao();
        int pontuacaoP = Personalidade.P.getPontuacao();
        int pontuacaoJ = Personalidade.J.getPontuacao();

        if (pontuacaoI > pontuacaoE && pontuacaoS > pontuacaoN && pontuacaoF > pontuacaoT && pontuacaoJ > pontuacaoP) {
            return "Você é uma pessoa paciente, detalhista e humilde, que se destaca pela motivação em servir ao próximo.\n\nÁreas recomendadas:\nENFERMAGEM\nASSISTÊNCIA SOCIAL\nGESTÃO AMBIENTAL";
        } else if (pontuacaoI > pontuacaoE && pontuacaoS > pontuacaoN && pontuacaoF > pontuacaoT && pontuacaoP > pontuacaoJ) {
            return "Você costuma ser sensível, modesto e perfeccionista, que se motiva por expressões não verbais.\n\nÁreas recomendadas:\nGASTRONOMIA\nMÚSICA\nARTES PLÁSTICAS\nTEATRO";
        } else if (pontuacaoI > pontuacaoE && pontuacaoN > pontuacaoS && pontuacaoT > pontuacaoF && pontuacaoJ > pontuacaoP) {
            return "Você é uma pessoa autoconfiante, lógica e independente, porém reserva e contida, preferindo, portanto, contato em grupos menores.\n\nÁreas recomendadas:\nDIREITO\nENGENHARIA\nREDAÇÃO";
        } else if (pontuacaoI > pontuacaoE && pontuacaoS > pontuacaoN && pontuacaoT > pontuacaoF && pontuacaoJ > pontuacaoP) {
            return "Você é uma pessoa conservadora, reservada, organizada, sistemática, realista e prática\n\nÁreas recomendadas:\nSAÚDE\nPILOTAGEM\nARTES";
        } else if (pontuacaoI > pontuacaoE && pontuacaoS > pontuacaoN && pontuacaoT > pontuacaoF && pontuacaoP > pontuacaoJ) {
            return "Você é uma pessoa prática, impulsiva e adaptável, que costuma trabalhar aduamente para fazer mais com menos.\n\nÁreas recomendadas:\nSAÚDE\nPILOTAGEM\nARTES";
        } else if (pontuacaoI > pontuacaoE && pontuacaoN > pontuacaoS && pontuacaoF > pontuacaoT && pontuacaoJ > pontuacaoP) {
            return "Você é uma pessoa reservada, idealista e profunda, hábil em conquistar a confiança e simpatia dos outros.\n\nÁreas recomendadas:\nPSICOLOGIA\nEDUCAÇÃO\nMEDICINA";
        } else if (pontuacaoE > pontuacaoI && pontuacaoN > pontuacaoS && pontuacaoF > pontuacaoT && pontuacaoJ > pontuacaoP) {
            return "Você é uma pessoa entusiasmada, idealista, prestativa e envolvente, que é especialista em desenvolver outras pessoas.\n\nÁreas recomendadas:\nCOACHING\nEDUCAÇÃO\nEDUCAÇÃO FÍSICA\nDIPLOMACIA";
        } else if (pontuacaoI > pontuacaoE && pontuacaoN > pontuacaoS && pontuacaoT > pontuacaoF && pontuacaoP > pontuacaoJ) {
            return "Você costuma ser uma pessoa reservada, independente, estratégica, pragmática e com uma boa inteligência espacial.\n\nÁreas recomendadas:\nARQUITETURA\nENGENHARIA\nCIÊNCIAS DA COMPUTAÇÃO";
        } else if (pontuacaoE > pontuacaoI && pontuacaoN > pontuacaoS && pontuacaoT > pontuacaoF && pontuacaoP > pontuacaoJ) {
            return "Você é uma pessoa criativa, analítica e adaptável, que costuma ter uma boa capacidade de analisar riscos e visão estratégica.\n\nÁreas recomendadas\nARQUITETURA\nDESIGN\nADMINISTRAÇÃO";
        } else if (pontuacaoE > pontuacaoI && pontuacaoS > pontuacaoN && pontuacaoF > pontuacaoT && pontuacaoP > pontuacaoJ) {
            return "Você é uma pessoa que se destaca pela simpatia e pela necessidade de agradar às outras pessoas.\n\nÁreas recomendadas:\nRELAÇÕES PÚBLICAS\nARTES\nVENDAS";
        } else if (pontuacaoE > pontuacaoI && pontuacaoS > pontuacaoN && pontuacaoT > pontuacaoF && pontuacaoP > pontuacaoJ) {
            return "Você é uma pessoa auutoconfiante, negociadora e competitiva, que enxerga boas oportunidades com felicidade.\n\nÁreas recomendadas:\nEMPREENDEDORISMO\nRELAÇÕES PÚBLICAS\nGESTÃO";
        } else if (pontuacaoE > pontuacaoI && pontuacaoN > pontuacaoS && pontuacaoF > pontuacaoT && pontuacaoP > pontuacaoJ) {
            return "Você é uma pessoa entusiasmada, sociável e diplomática por excelência, que enxerga com facilidade os talentos dos outros.\n\nÁreas recomendadas:\nDIREITO\nDIPLOMACIA\nESPORTES\nPOLÍTICA";
        } else if (pontuacaoI > pontuacaoE && pontuacaoN > pontuacaoS && pontuacaoF > pontuacaoT && pontuacaoP > pontuacaoJ) {
            return "Você é uma pessoa compreensiva, discreta e sensível, capaz de identificar facilmente as necessidades dos outros.\n\nÁreas recomendadas:\nDIPLOMACIA\nJORNALISMO\nDIREITO";
        } else if (pontuacaoE > pontuacaoI && pontuacaoS > pontuacaoN && pontuacaoT > pontuacaoF && pontuacaoJ > pontuacaoP) {
            return "Você é uma pessoa eficiente, objetiva, decidida, conservadora e que valoriza a segurança e estabilidade.\n\nÁreas recomendadas:\nADMINISTRAÇÃO\nCONTABILIDADE\nGESTÃO PÚBLICA";
        } else if (pontuacaoE > pontuacaoI && pontuacaoS > pontuacaoN && pontuacaoF > pontuacaoT && pontuacaoJ > pontuacaoP) {
            return "Você é uma pessoa sociável, cooperativa e afetiva, que coloca as pessoas em primeiro lugar.\n\nÁreas recomendadas:\nCONSULTORIA\nACESSORIA\nEDUCAÇÃO FÍSICA";
        } else if (pontuacaoE > pontuacaoI && pontuacaoN > pontuacaoS && pontuacaoT > pontuacaoF && pontuacaoJ > pontuacaoP) {
            return "Você é uma pessoa curiosa, lógica, crítica, sociável, estrategista, confiante e que adora liderar.\n\nÁreas recomendadas:\nPUBLICIDADE\nENGENHARIA\nECONOMIA";
        } else {
            return "ERRO";
        }
    }
}
