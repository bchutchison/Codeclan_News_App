package com.codeclan.newsapp.NewsAppProject.components;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import com.codeclan.newsapp.NewsAppProject.models.Category;
import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import com.codeclan.newsapp.NewsAppProject.repository.ArticleRepository.ArticleRepository;
import com.codeclan.newsapp.NewsAppProject.repository.CategoryRepository.CategoryRepository;
import com.codeclan.newsapp.NewsAppProject.repository.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Journalist journalist1 = new Journalist( "Iain", "McWhirter");
        journalistRepository.save(journalist1);

        Journalist journalist2 = new Journalist( "Sally", "Magnusson");
        journalistRepository.save(journalist2);

        Journalist journalist3 = new Journalist( "Kevin", "Maguire");
        journalistRepository.save(journalist3);

        Journalist journalist4 = new Journalist( "Catriona", "Shearer");
        journalistRepository.save(journalist4);

        Journalist journalist5 = new Journalist( "Eva", "White");
        journalistRepository.save(journalist5);

        Journalist journalist6 = new Journalist( "Chris", "Iron");
        journalistRepository.save(journalist6);

        Category category1 = new Category("Politics");
        categoryRepository.save(category1);

        Category category2 = new Category("Sport");
        categoryRepository.save(category2);

        Category category3 = new Category("Environment");
        categoryRepository.save(category3);

        Category category4 = new Category("Science");
        categoryRepository.save(category4);

        Category category5 = new Category("Entertainment");
        categoryRepository.save(category5);

        Category category6 = new Category("Tech");
        categoryRepository.save(category6);

        Category category7 = new Category("Health");
        categoryRepository.save(category7);

        Category category8 = new Category("Business");
        categoryRepository.save(category8);

        Category category9 = new Category("Crime");
        categoryRepository.save(category9);

        Category category10 = new Category("Education");
        categoryRepository.save(category10);

        Article article1 = new Article(
                "Post-Crash Bitcoin Warning As Wallets Targeted In ‘Active And Ongoing’ Hack Attack",
                3,
                "A bad week for bitcoin investors just got worse. First, there was the crash, and now a threat to wallets has been identified.",
                "First bitcoin crashes and then more bad news is piled onto cryptocurrency investors Bitcoin wentinto" +
                        " meltdown starting September 24 when the BTC price dropped by more than 10% " +
                        " in what some highly-respected commentators referred to as a bitcoin crash. " +
                        "The bad news for bitcoin continued through the week, with the price continuing " +
                        "to fluctuate around, and below, $8,000 (£6,500). Now bitcoin buyers have been " +
                        "issued a warning concerning another threat to their cryptocurrency investment; " +
                        "an active and ongoing threat campaign that steals bitcoin wallets.",
                journalist1,
                "https://thumbor.forbes.com/thumbor/600x315/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F976598338%2F960x0.jpg");
        articleRepository.save(article1);

        Article article2 = new Article(
                "Crypto Exchange Coindirect Launches OTC Brokerage in South Africa",
                4,
                "Cryptocurrency exchange Coindirect launches an over-the-counter brokerage service in South Africa",
                "Cryptocurrency exchange Coindirect launches an over-the-counter (OTC) brokerage in South Africa " +
                        "Coindirect cryptocurrency exchange has launched an over-the-counter (OTC) brokerage system that targets " +
                        "large volume traders. The service was launched for South Africa, " +
                        "with the exchange promising its traders the lowest fees and the best prices." +
                        "The decision to launch the OTC desk was informed by extensive research conducted" +
                        " by the firm, the exchange’s COO Nic Haralambous stated in a press release: " +
                        " During our first two years in the industry we have paid close attention " +
                        "to which users are driving the volume of crypto trading." +
                        " Our approach is to bring cryptocurrency to as many users as possible," +
                        " however, " + "the data shows that a majority of the daily trading volume in South Africa right now comes " +
                        "from a very small percentage of traders." + " This group of traders spends a lot of time " +
                        "conducting research so that they can make their trades at the lowest fees and best prices, he went on. " +
                        " The new service will solve both of these challenges for the traders. " +
                        " Coindirect will use global integrations to create a wide pool of liquidity sources that will enable a best price guarantee. ",
                journalist2,
                "https://images.cointelegraph.com/images/740_aHR0cHM6Ly9zMy5jb2ludGVsZWdyYXBoLmNvbS9zdG9yYWdlL3VwbG9hZHMvdmlldy9iNTI5MGI0NTE4ZjY0ZTc5MTI1YWRkNzYzMTYxOWIwNS5qcGc=.jpg"
        );
        articleRepository.save(article2);

        Article article3 = new Article(
                "CoinCola, Leading the Digital Currency Education Across Africa",
                6,
                "COINCOLA CRYPTO TOUR NIGERIA The digital currency sphere has experienced significant growth in " +
                        "Africa over the past 10 years. This growth is largely catalyzed by a user base under age 40. CoinCola is at the forefront of the digital currency peer-to-peer marke…",
                "COINCOLA CRYPTO COINCOLA CRYPTO TOUR NIGERIA The digital currency sphere has experienced " +
                        "significant growth in Africa over the past 10 years."+
                "It went from a hype to a relevant and ever-present interest. Cryptocurrency interests as a form of digital currency has experienced consistent growth across Africa. This innovation perceived as highly disruptive by some schools of thought has taken a stronghold " +
                        "on the continent." + "Owing to its database storage (blockchain) and free geographical freedom as an internet-based ecosystem, cryptocurrency is up for more positive adoption by the young crowd who currently make up a major part of Africa’s young population."
                         + "Read more at" + " https://www.vanguardngr.com/2019/09/coincola-leading-the-digital-currency-education-across-africa/",
                journalist3,
                "https://i2.wp.com/cdn.vanguardngr.com/wp-content/uploads/2019/09/IMG-20190927-WA0001" +
                        ".jpg?fit=1080%2C1080&ssl=1"
        );
        articleRepository.save(article3);

        Article article4 =  new Article(
                "BTC Price Rebounds From $7,700: Crypto Traders Hope for Relief Rally",
                2,
                "Technical analysts anticipate Bitcoin’s price to recover in the short term in a relief rally " +
                        "following a minor rebound to $8,200",
                "Subsequent to the recovery of the Bitcoin price (BTC) movement from $7,700 to around $8,200 in the " +
                        "past 24 hours, technical analysts anticipate Bitcoin and other major crypto assets to " +
                        "recover in the short term. Speaking to Cointelegraph, crypto trader Nick " +
                        "said that there are plenty of times when the price history was at $7,600, which is likely to hold as a level of strong support " +
                        "for traders in the upcoming days. Technical analysts remain divided on the Bitcoin price trend and the rest of the crypto market, but most generally " +
                        "agree that there is strong demand to buy BTC in the mid-$6,000 to $7,000 region." +
                        "According to Rager, the sell-off of Bitcoin in recent weeks was triggered by holders of newly acquired BTC, indicating that investors with a long-term thesis, known as “hodlers,” did not capitulate as a cascade of long " +
                        "contract liquidations on BitMEX, which intensified the downward movement." +
                        "When Bitcoin’s price initially fell below $9,000, crypto data aggregator Datamish showed that more than $650 million worth of long contracts on BitMEX were liquidated. In the days that followed — especially" +
                        " as BTC dropped below $8,000 — upward of $100 million worth of long contracts were liquidated, bringing the total to about $750 million.",
                journalist4,
                "https://images.cointelegraph.com/images/740_aHR0cHM6Ly9zMy5jb2ludGVsZWdyYXBoLmNvbS9zdG9yYWdlL3VwbG9hZHMvdmlldy80NTcxOGYzODBjZmIxNmQ0YjQ1OWQ0MTBlZmNlZDc3YS5qcGc=.jpg"
        );
        articleRepository.save(article4);


        Article article5 =  new Article(
                "Adele 'dating Grime star Skepta' after marriage split from Simon Konecki",
                4,
                "Adele, 31, is reportedly dating Grime artist Skepta, 37, following the breakdown of her marriage with Simon Konecki, friends of the pair are reportedly 'hoping' they become a 'great couple.",
                "A source revealed to the publication: 'Adele and Skepta have been there for each other a lot after both their relationships split up. They have a close bond and there’s definitely a special connection."+
                "The insider added: 'They are both private about their love lives and they are both committed to their children first and foremost as well."+
                "Adele shares a son, Angelo, with Simon while Skepta - real name Joseph Junior Adenuga Jr - became a father in Novemeber.",
                journalist5,
                "https://i.dailymail.co.uk/1s/2019/10/01/08/19142910-0-image-a-9_1569914051456.jpg"
        );
        articleRepository.save(article5);

        Article article6 = new Article(
                "Why hydrogen is NOT the fuel of the future – Dr Richard Dixon",
                 3,
                "As Scotland seeks to reduce climate emissions even faster than before, we are in serious danger of taking the wrong road, writes Dr Richard Dixon.",
                "Last week’s vote on the Climate Bill saw a welcome increase in Scotland’s short-term target to a 75 per cent reduction by 2030. This was a huge success for the 40,000 people in Scotland who marched and rallied on the streets the Friday before." +
                        "Now that we have agreed the new targets, the Climate Change Plan will be thoroughly revised by the spring of next year. In parallel, the Scottish Government will revise its Energy Strategy." + "We have a target of 100 per cent of the electricity we use in Scotland to come from renewables by 2020.",
                journalist6,
                "https://images-e.jpimedia.uk/imagefetch/w_700,f_auto,ar_3:2,q_auto:low,c_fill/if_h_lte_200,c_mfit,h_201/https://www.scotsman.com/webimage/1.5014568.1569860287!/image/image.jpg"
        );
        articleRepository.save(article6);

        Article article7 = new Article(
                "Iomart says market for cloud computing 'large and long-term",
                5,
                "Cloud computing and web hosting company Iomart said the market opportunity for the business “remains large and long-term” as the Glasgow-based group updated investors on recent trading.",
                "Releasing a trading statement for the six months to the end of September, the firm noted that overall revenue growth was in line with expectations, with 'good visibility'" +
                        " heading into the second half of the year." +
                        "Iomart, which in June reported that annual " +
                        "revenues had surpassed £100 million for the first time, " +
                        "said that a reorganisation of its commercial operations " +
                        "was now starting to deliver more new customer wins and a 'stronger pipeline of opportunities'. ",
                journalist6,
                "https://images-e.jpimedia.uk/imagefetch/w_700,f_auto,ar_3:2,q_auto:low,c_fill/if_h_lte_200,c_mfit,h_201/https://www.scotsman.com/webimage/1.5014809.1569919499!/image/image.jpg"
        );
        articleRepository.save(article7);

        Article article8 = new Article(
                "Borders College students celebrate at graduation ceremony",
                2,
                "More than 160 graduates gathered at the Borders Events Centre in Kelso’s Springwood Park for this year’s Borders College graduation ceremony.",
                "This year’s ceremony took place at the Borders Events Centre in Kelso. " + "A day described by the Chair of the Regional" +
                        "Board for Borders College, Tony Jakimciw, as the best day of the College year"+
                "This year’s ceremony, which saw in the region of 160 graduands cross the stage to receive their education awards, " +
                        "had a real air of celebration and fun, even including a selfie booth for guests to enjoy after the formal " +
                        "proceedings had taken place." + "College Principal Angela Cox congratulated all graduands and encouraged them " +
                        "to reflect on their studies and be resilient in whatever they do. Angela also presented this year’s Honorary " +
                        "Fellowship to Nick Bannerman from Hawick, known for his role in the local textile industry.",
                journalist4,
                "http://www.borderscollege.ac.uk/upload/image/Sept19News/DSC_8530%20(Medium).JPG"
        );
        articleRepository.save(article8);


        Article article9 = new Article(
                "Concerns raised over surgeon after 'below standard' operation",
                1,
                "The General Medical Council should be made aware of concerns about a surgeon who carried out an operation which went wrong, a report has said.",
                "The Scottish Public Services Ombudsman said the problem could have been avoided if the surgeon had exercised reasonable skill and care." +
                        "It followed a complaint from a patient at Monklands University Hospital in Lanarkshire." +
                        "" +
                        "The woman said she had not been told of serious risks in the procedure." +
                        "" +
                        "NHS Lanarkshire said it had apologised to the patient, and was implementing the recommendations made by the ombudsman."+
                        "The patient, known only as Ms C, suffered a major vascular injury during an operation to remove her gallbladder."
                         + "She became unstable in recovery and needed to return to theatre for open surgery to repair tears in her bowel and an artery" +
                        "She required a large blood transfusion" + "Ms C said she had been told " +
                        "the procedure was a simple keyhole operation, but had received no explanation of the small risk of major vascular injury, "
                        + "or what actions would have been necessary in the event of a serious complication."
                         +"The ombudsman, Rosemary Agnew, upheld her complaint." +
                        "Ms C also complained about the mistake made during her surgery." +
                         "The ombudsman's report said: 'We considered that the major vascular injury could have been avoided if the operating surgeon'" +
                        " had exercised reasonable skill and care." + "In technical delivery, decision-making and note-keeping, the surgical care provided during the operation fell seriously below " +
                        "the standard we would expect of a reasonably competent consultant general surgeon.",
                journalist1,
                "https://ichef.bbci.co.uk/news/624/cpsprodpb/B5D1/production/_108854564_operation_getty.jpg"
        );
        articleRepository.save(article9);

        Article article10 =  new Article(
                "Woman dies after being struck by lightning while hiking in Scottish Highlands",
                4,
                "A woman who died after being struck by lightning while walking on a mountain range in the Scottish Highlands has been named as Isobel Bytautas.",
                "The 55-year-old was hiking near Glencoe on Saturday evening when she and another member of her walking group were hit." +
                        "Police Scotland said both walkers were airlifted to a hospital in Fort William, but one died from her injuries. The other walker is in a stable condition." +
                        "Ms Bytautas’ next of kin have been informed." +
                        "Coastguard and ambulance service helicopters, alongside the Glencoe Mountain Rescue Team, were dispatched to find the wounded group. They were located on Na Gruagaichean, a mountain about five miles south of Ben Nevis.",
                journalist2,
                "https://static.independent.co.uk/s3fs-public/thumbnails/image/2019/06/09/12/isobel-bytautas-hiker.jpg?w968"
        );
        articleRepository.save(article10);

        Article article11 = new Article(
                "Brexit: Boris Johnson’s ‘reckless’ plan for Irish border prompts outrage",
                7,
                "There is near-unanimous political outrage in Ireland over a leaked British government plan to throw up a “buffer zone” with customs posts on the Irish border",
                "Parties across the political spectrum branded it 'out of the question'." + "Secret proposals presented to Brussels suggested building vast'customs processing centres' " + "along the frontier as a replacement for the Brexit backstop." + "Irish public broadcaster RTE reports that the plan was included in “non-papers” presented to Commission negotiators." +
                 "The ideas represent a significant reversal by the UK government on commitments made under Theresa May to avoid “checks and controls” " + "between the two territories to preserve the Northern Ireland peace process."+ "Ireland’s foreign minister Simon Coveney said that the proposals were a “non-starter”. + “Time the EU had a serious proposal " +
                        "from the UK government if a Brexit deal is to be achievable in October. Northern Ireland and Ireland deserves better!” he tweeted.",
                journalist3,
                "https://static.independent.co.uk/s3fs-public/thumbnails/image/2019/09/30/13/tory-conference-merchandise-12.jpg?width=1368&height=912&fit=bounds&format=pjpg&auto=webp&quality=70"
        );
        articleRepository.save(article11);


        article1.addCategory(category1);
        article1.addCategory(category2);
        articleRepository.save(article1);

        //article1.addCategory(category2);
        //articleRepository.save(article1);

        article2.addCategory(category3);
        articleRepository.save(article2);

        article3.addCategory(category2);
        articleRepository.save(article3);

        article4.addCategory(category4);
        articleRepository.save(article4);

        article5.addCategory(category5);
        articleRepository.save(article5);

        article6.addCategory(category3);
        articleRepository.save(article6);

        article7.addCategory(category8);
        article7.addCategory(category6);
        articleRepository.save(article7);

        article8.addCategory(category10);
        articleRepository.save(article8);

        article9.addCategory(category7);
        articleRepository.save(article9);

        article10.addCategory(category9);
        articleRepository.save(article10);

        article11.addCategory(category1);
        article11.addCategory(category8);
        articleRepository.save(article11);

    }
}

