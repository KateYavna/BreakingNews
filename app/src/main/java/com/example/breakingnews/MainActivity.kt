package com.example.breakingnews

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_news.*

class MainActivity : AppCompatActivity(), NewsCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var news = getNews()
        rvNews.adapter = NewsAdapter(this,news, this,counter)
        rvNews.layoutManager = LinearLayoutManager (this)
    }


    fun getNews(): ArrayList<News>{
        var news = ArrayList<News>()

        news.add(
            News(
            BitmapFactory.decodeResource(resources, R.drawable.floodtragedy),
            "Deadly floods inundated parts of Europe but the Netherlands avoided fatalities. Here\'s why",
                "As communities devastated by the catastrophic flooding in parts\n" +
                        "        of western Europe start picking up the pieces, they are wondering how it all went so wrong,\n" +
                        "        so fast. After all, Europe has a world-leading warning system that issued regular alerts for days before\n" +
                        "        floods engulfed entire villages.\n" +
                        "\n" +
                        "But at least 195 people still died in Germany and Belgium, in floods that came quickly and forcefully.\n" +
                        "        The Copernicus Emergency Management Service said it sent more than 25 warnings for specific regions\n" +
                        "        of the Rhine and Maas river basins in the days leading up to the flooding, through its European Flood Awareness\n" +
                        "        System (EFAS), well before heavy rains triggered the flash flooding.\n" +
                        "But few of these early warnings appear to have been passed on to residents early -- and clearly -- enough,\n" +
                        "        catching them completely off guard. Now questions are being raised over whether the chain of communication\n" +
                        "        from the central European level to regions is working."

        ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.davinci),
                "Researchers identify 14 living descendants of Leonardo da Vinci\'s family",
                "Decades-long research into Leonardo da Vinci\'s purported remains has revealed how many people currently alive can claim to be " +
                        "descendants of the family of the Renaissance genius and \"Mona Lisa\" painter: It\'s 14.\n" +
                        "The findings, published in the journal Human Evolution this month, comes from a new genealogical tree going through 21 generations and four branches.\n" +
                        "Did Leonardo da Vinci have ADHD? Academics say he did\n" +
                        "The research is part of the Leonardo Da Vinci DNA Project, which aims to confirm remains thought to be his and to \"better understand his" +
                        " extraordinary talents and visual acuity through genetic associations.\""

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.delta),
                "Dow sinks more than 900 points as Delta variant fears hit Wall Street hard",
                "Investors are getting spooked by the rising numbers of Covid-19 cases as the Delta variant spreads across the globe.\n" +
                        "\n" +
                        "The Dow fell more than 930 points in mid-afternoon trading Monday, a drop of 2.7%. The S&P 500 fell 2.1% and the Nasdaq was 1.6% lower.\n" +
                        "This is shaping up to be the worst day for the Dow since a 943-point drop in late October. But the blue chip market barometer has had several " +
                        "even bigger point plunges since the start of 2020 due to concerns about the Covid-19 pandemic.\n" +
                        "The Dow plummeted more than 1,000 points six times last year, with five of those market meltdowns taking place in March at the start of the " +
                        "pandemic in America. The Dow suffered its biggest point slide ever on March 16, 2020, dropping nearly 3,000 points — a 13% freefall."

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.miners),
                "Illegal gold miners threaten fragile way of life, deep in Amazon rainforest",
                "Deep in the Amazon rainforest, the Yanomami people are battling an old and elusive enemy -- one they haven\'t seen since the 1980s.\n" +
                        "\n" +
                        "Dressed in traditional headdress, faces decorated with paint, this indigenous community prepares its bows and spears to defend their land " +
                        "against garimpeiros -- illegal gold miners looking for glimmers of gold in this vast and rich territory.\n" +
                        "Fernando, one of the Yanomami leaders, told CNN on a recent reporting trip to the riverside Palimiu settlement what the community has been enduring for months now."

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.stolendog),
                "When a woman stole his dog, this man didn\'t press charges. Instead, he\'s paying for her drug rehab",
                "Drug addiction sabotaged Brayden Morton for five years. During that span, he attempted to get clean of fentanyl 16 times before he was successful.\n" +
                        "\n" +
                        "So, when he found the person who stole his beloved dog, Darla, and discovered she was addicted to fentanyl, he knew what to do: pay for her rehab and help save her life.\n" +
                        "In June, Morton was working in his home office in Cranbrook, British Columbia, while Darla, a 3-year-old Chinese shar-pei, lounged on the deck, soaking up the sun.\n" +
                        "As he worked, Morton heard a loud noise followed by the sound of his gate being opened.\n" +
                        "\"I look out the window and I don\'t see Darla anymore. I ran down the stairs and out to the deck, Darla was gone, and I saw a blue Ford truck back out and speed off,\" Morton, 35, told CNN"

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.floodtragedy),
                "Deadly floods inundated parts of Europe but the Netherlands avoided fatalities. Here\'s why",
                "As communities devastated by the catastrophic flooding in parts\n" +
                        "        of western Europe start picking up the pieces, they are wondering how it all went so wrong,\n" +
                        "        so fast. After all, Europe has a world-leading warning system that issued regular alerts for days before\n" +
                        "        floods engulfed entire villages.\n" +
                        "\n" +
                        "But at least 195 people still died in Germany and Belgium, in floods that came quickly and forcefully.\n" +
                        "        The Copernicus Emergency Management Service said it sent more than 25 warnings for specific regions\n" +
                        "        of the Rhine and Maas river basins in the days leading up to the flooding, through its European Flood Awareness\n" +
                        "        System (EFAS), well before heavy rains triggered the flash flooding.\n" +
                        "But few of these early warnings appear to have been passed on to residents early -- and clearly -- enough,\n" +
                        "        catching them completely off guard. Now questions are being raised over whether the chain of communication\n" +
                        "        from the central European level to regions is working."

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.davinci),
                "Researchers identify 14 living descendants of Leonardo da Vinci\'s family",
                "Decades-long research into Leonardo da Vinci\'s purported remains has revealed how many people currently alive can claim to be " +
                        "descendants of the family of the Renaissance genius and \"Mona Lisa\" painter: It's 14.\n" +
                        "The findings, published in the journal Human Evolution this month, comes from a new genealogical tree going through 21 generations and four branches.\n" +
                        "Did Leonardo da Vinci have ADHD? Academics say he did\n" +
                        "The research is part of the Leonardo Da Vinci DNA Project, which aims to confirm remains thought to be his and to \"better understand his" +
                        " extraordinary talents and visual acuity through genetic associations.\""

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.delta),
                "Dow sinks more than 900 points as Delta variant fears hit Wall Street hard",
                "Investors are getting spooked by the rising numbers of Covid-19 cases as the Delta variant spreads across the globe.\n" +
                        "\n" +
                        "The Dow fell more than 930 points in mid-afternoon trading Monday, a drop of 2.7%. The S&P 500 fell 2.1% and the Nasdaq was 1.6% lower.\n" +
                        "This is shaping up to be the worst day for the Dow since a 943-point drop in late October. But the blue chip market barometer has had several " +
                        "even bigger point plunges since the start of 2020 due to concerns about the Covid-19 pandemic.\n" +
                        "The Dow plummeted more than 1,000 points six times last year, with five of those market meltdowns taking place in March at the start of the " +
                        "pandemic in America. The Dow suffered its biggest point slide ever on March 16, 2020, dropping nearly 3,000 points — a 13% freefall."

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.miners),
                "Illegal gold miners threaten fragile way of life, deep in Amazon rainforest",
                "Deep in the Amazon rainforest, the Yanomami people are battling an old and elusive enemy -- one they haven\'t seen since the 1980s.\n" +
                        "\n" +
                        "Dressed in traditional headdress, faces decorated with paint, this indigenous community prepares its bows and spears to defend their land " +
                        "against garimpeiros -- illegal gold miners looking for glimmers of gold in this vast and rich territory.\n" +
                        "Fernando, one of the Yanomami leaders, told CNN on a recent reporting trip to the riverside Palimiu settlement what the community has been enduring for months now."

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.stolendog),
                "When a woman stole his dog, this man didn\'t press charges. Instead, he\'s paying for her drug rehab",
                "Drug addiction sabotaged Brayden Morton for five years. During that span, he attempted to get clean of fentanyl 16 times before he was successful.\n" +
                        "\n" +
                        "So, when he found the person who stole his beloved dog, Darla, and discovered she was addicted to fentanyl, he knew what to do: pay for her rehab and help save her life.\n" +
                        "In June, Morton was working in his home office in Cranbrook, British Columbia, while Darla, a 3-year-old Chinese shar-pei, lounged on the deck, soaking up the sun.\n" +
                        "As he worked, Morton heard a loud noise followed by the sound of his gate being opened.\n" +
                        "\"I look out the window and I don\'t see Darla anymore. I ran down the stairs and out to the deck, Darla was gone, and I saw a blue Ford truck back out and speed off,\" Morton, 35, told CNN"

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.floodtragedy),
                "Deadly floods inundated parts of Europe but the Netherlands avoided fatalities. Here\'s why",
                "As communities devastated by the catastrophic flooding in parts\n" +
                        "        of western Europe start picking up the pieces, they are wondering how it all went so wrong,\n" +
                        "        so fast. After all, Europe has a world-leading warning system that issued regular alerts for days before\n" +
                        "        floods engulfed entire villages.\n" +
                        "\n" +
                        "But at least 195 people still died in Germany and Belgium, in floods that came quickly and forcefully.\n" +
                        "        The Copernicus Emergency Management Service said it sent more than 25 warnings for specific regions\n" +
                        "        of the Rhine and Maas river basins in the days leading up to the flooding, through its European Flood Awareness\n" +
                        "        System (EFAS), well before heavy rains triggered the flash flooding.\n" +
                        "But few of these early warnings appear to have been passed on to residents early -- and clearly -- enough,\n" +
                        "        catching them completely off guard. Now questions are being raised over whether the chain of communication\n" +
                        "        from the central European level to regions is working."

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.davinci),
                "Researchers identify 14 living descendants of Leonardo da Vinci\'s family",
                "Decades-long research into Leonardo da Vinci\'s purported remains has revealed how many people currently alive can claim to be " +
                        "descendants of the family of the Renaissance genius and \"Mona Lisa\" painter: It's 14.\n" +
                        "The findings, published in the journal Human Evolution this month, comes from a new genealogical tree going through 21 generations and four branches.\n" +
                        "Did Leonardo da Vinci have ADHD? Academics say he did\n" +
                        "The research is part of the Leonardo Da Vinci DNA Project, which aims to confirm remains thought to be his and to \"better understand his" +
                        " extraordinary talents and visual acuity through genetic associations.\""

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.delta),
                "Dow sinks more than 900 points as Delta variant fears hit Wall Street hard",
                "Investors are getting spooked by the rising numbers of Covid-19 cases as the Delta variant spreads across the globe.\n" +
                        "\n" +
                        "The Dow fell more than 930 points in mid-afternoon trading Monday, a drop of 2.7%. The S&P 500 fell 2.1% and the Nasdaq was 1.6% lower.\n" +
                        "This is shaping up to be the worst day for the Dow since a 943-point drop in late October. But the blue chip market barometer has had several " +
                        "even bigger point plunges since the start of 2020 due to concerns about the Covid-19 pandemic.\n" +
                        "The Dow plummeted more than 1,000 points six times last year, with five of those market meltdowns taking place in March at the start of the " +
                        "pandemic in America. The Dow suffered its biggest point slide ever on March 16, 2020, dropping nearly 3,000 points — a 13% freefall."

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.miners),
                "Illegal gold miners threaten fragile way of life, deep in Amazon rainforest",
                "Deep in the Amazon rainforest, the Yanomami people are battling an old and elusive enemy -- one they haven\'t seen since the 1980s.\n" +
                        "\n" +
                        "Dressed in traditional headdress, faces decorated with paint, this indigenous community prepares its bows and spears to defend their land " +
                        "against garimpeiros -- illegal gold miners looking for glimmers of gold in this vast and rich territory.\n" +
                        "Fernando, one of the Yanomami leaders, told CNN on a recent reporting trip to the riverside Palimiu settlement what the community has been enduring for months now."

            ))
        news.add(
            News(
                BitmapFactory.decodeResource(resources, R.drawable.stolendog),
                "When a woman stole his dog, this man didn\'t press charges. Instead, he\'s paying for her drug rehab",
                "Drug addiction sabotaged Brayden Morton for five years. During that span, he attempted to get clean of fentanyl 16 times before he was successful.\n" +
                        "\n" +
                        "So, when he found the person who stole his beloved dog, Darla, and discovered she was addicted to fentanyl, he knew what to do: pay for her rehab and help save her life.\n" +
                        "In June, Morton was working in his home office in Cranbrook, British Columbia, while Darla, a 3-year-old Chinese shar-pei, lounged on the deck, soaking up the sun.\n" +
                        "As he worked, Morton heard a loud noise followed by the sound of his gate being opened.\n" +
                        "\"I look out the window and I don\'t see Darla anymore. I ran down the stairs and out to the deck, Darla was gone, and I saw a blue Ford truck back out and speed off,\" Morton, 35, told CNN"

            ))



        return news
    }



         override fun onItemSelected(index :Int)  {
             Log.d("MyLog", "ok " + index)

         }


    }


