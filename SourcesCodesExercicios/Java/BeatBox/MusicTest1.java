import java.awt.Color;
import java.awt.Graphics2D;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.prism.Graphics;


public class MusicTest1 extends JFrame implements ControllerEventListener {	
	static JFrame f = new JFrame("My first music video");
	static MyDrawPanel ml;
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.go();
	}
	
	public void setupGui() {
		ml = new MyDrawPanel();
		f.setContentPane(ml);
		f.setBounds(30, 30, 300, 300);
		f.setVisible(true);
	}
	
	public void go() {
		setupGui();
		try{
			//sequencer é o que reproduz a música(o aparelho de som)
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			
			int[] eventsIWant = {127};
			player.addControllerEventListener(ml, new int[] {127} );
			
			//A música a ser reproduzida, o cd de música
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			
			//as informações da música, uma faixa
			javax.sound.midi.Track track = seq.createTrack();
			
			int r = 0;
			for(int i = 0; i < 60; i += 4){
				r = (int) (Math.random() * 50);
				track.add(makeEvent(144, 1, r, 100, i));
				
				track.add(makeEvent(176, 1, 127, 0, i));
				
				track.add(makeEvent(128, 1, r, 100, i+2));
			}
			
			player.setSequence(seq);
			player.setTempoInBPM(220);
			player.start();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}
	
	public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try{
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event =  new MidiEvent(a, tick);

		} catch(Exception e){  }
		return event;
	}
	
	class MyDrawPanel extends JPanel implements ControllerEventListener {
		boolean msg = false;
		public void controlChange(ShortMessage event) {
			msg = true;
			repaint();
		}
		
		public void paintComponent(Graphics g){
			if(msg) {
				Graphics2D g2 = (Graphics2D) g;
				
				int r = (int) (Math.random() * 250);
				int gr = (int) (Math.random() * 250);
				int b = (int) (Math.random() * 250);
				
				g2.setColor(new Color(r, gr, b));
				
				int ht = (int) ((Math.random() * 120) + 10);
				int width = (int) ((Math.random() * 120) + 10);
				
				int y = (int) ((Math.random() * 40) + 10);
				int x = (int) ((Math.random() * 40) + 10);
				
				g.fillRect(x, y, ht, width);
				msg = false;
			}
		}
	}

}
